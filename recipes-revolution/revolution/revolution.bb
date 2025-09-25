DESCRIPTION = "Revolution"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/blueskysolarracing/revolution.git;protocol=https;branch=main;"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${datadir}/revolution/
    # install -m 0755 ${WORKDIR}/revolution/* ${D}${datadir}/revolution
    cp -r ${S}/* ${D}${datadir}/revolution/
}
