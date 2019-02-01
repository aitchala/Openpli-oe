SUMMARY = "Amlogic codecs library"
PACKAGE_ARCH = "${MACHINE_ARCH}"
require wetek-libamcodec.inc

COMPATIBLE_MACHINE = "wetekplay2"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


#DEPENDS = "linkdroid-libamadec-alien5"
#RDEPENDS_${PN} = "linkdroid-libamadec-alien5"

inherit lib_package pkgconfig

SRC_URI = "https://raw.githubusercontent.com/OpenVisionE2/amlogic-libs/master/libamcodec-210755d.tar.gz \
           file://libamcodec.pc \
"

SRC_URI[md5sum] = "d2e7dc15302fa64eef54aa67da5f9f34"
SRC_URI[sha256sum] = "79f2ae9c4be27f016314d6ff21f1264c32a73581e5f7c297a7efda6a4cb2df9b"

S = "${WORKDIR}/libamcodec-210755d/amcodec"

