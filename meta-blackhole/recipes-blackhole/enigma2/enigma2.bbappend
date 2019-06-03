FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= "-bh10"

RDEPENDS_${PN} += " \
		bhfullbackup \
		enigma2-plugin-extensions-openmultiboot \
		enigma2-plugin-extensions-epgsearch \
		enigma2-plugin-extensions-epgimportfilter \
	"
			
ENIGMA2_BRANCH = "master"

SRC_URI = "git://github.com/openmus/enigma2.git;protocol=http;branch=${ENIGMA2_BRANCH} \
			file://workaround-for-dns-no-dhcp.patch \
			file://enigma2-adapt-network-to-new-ip-formatting.patch \
			file://use-functional-depout-macro.patch \
			file://define-deprecated-macros.patch \
                        file://skindefault.tgz \
			"
EXTRA_OECONF += "${@bb.utils.contains("MACHINE_FEATURES", "uianimation", "--with-libvugles2" , "", d)}"

DEPENDS += "${@bb.utils.contains("MACHINE_FEATURES", "uianimation", "vuplus-libgles-${MACHINE} libvugles2" , "", d)}"
RDEPENDS_append_vuplus += "${@bb.utils.contains("MACHINE_FEATURES", "uianimation", "vuplus-libgles-${MACHINE} libvugles2" , "", d)}"
RDEPENDS_${PN} += "${@bb.utils.contains("MACHINE_FEATURES", "blindscan-dvbs", "virtual/blindscan-dvbs" , "", d)}"


