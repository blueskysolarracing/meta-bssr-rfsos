SUMMARY = "Install network helpers"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/scripts:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://bssrnet-start.sh"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${WORKDIR}/bssrnet-start.sh ${D}${bindir}/bssrnet-start
}
