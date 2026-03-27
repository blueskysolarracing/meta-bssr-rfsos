SUMMARY = "Install the network helper systemd service"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/service:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://bssrnet-ap.service \
           file://bssrnet-wifi.service"

do_install() {
        install -d ${D}${sysconfdir}/systemd/system
        install -m 0755 ${WORKDIR}/bssrnet-ap.service ${D}${sysconfdir}/systemd/system/bssrnet-ap.service
        install -m 0755 ${WORKDIR}/bssrnet-wifi.service ${D}${sysconfdir}/systemd/system/bssrnet-wifi.service
}
