SUMMARY  = "Library to access Blu-Ray disk"
SECTION = "misc"
HOMEPAGE = "http://videolan.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM="file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

DEPENDS = "libxml2"

SRC_URI += "https://www.dropbox.com/s/9c6d8apmreh4i4f/libbluray_1.0.2.tar.gz "

SRC_URI[md5sum] = "4c7ee513721e551912d1268107f4660f"
SRC_URI[sha256sum] = "2035c8dff6ef354445e95b8bea9a6090761465c2dfbf5ea47c77f09aa3707114"

inherit gitpkgv autotools-brokensep pkgconfig

SRCREV = "${AUTOREV}"

S="${WORKDIR}/git"

EXTRA_OECONF = " \
    --disable-bdjava-jar \
    --disable-doxygen-doc \
    --disable-doxygen-dot \
    --without-freetype \
    --without-fontconfig \
"
