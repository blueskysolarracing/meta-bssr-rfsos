SUMMARY = "Install network helpers"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/scripts:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://bssrnet-ap.sh \
           file://bssrnet-wifi.sh"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${WORKDIR}/bssrnet-ap.sh ${D}${bindir}/bssrnet-ap
        install -m 0755 ${WORKDIR}/bssrnet-wifi.sh ${D}${bindir}/bssrnet-wifi
}
