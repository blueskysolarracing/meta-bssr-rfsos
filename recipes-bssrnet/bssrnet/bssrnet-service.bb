SUMMARY = "Install the network helper systemd service"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/service:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://bssrnet.service"

do_install() {
        install -d ${D}${sysconfdir}/systemd/system
        install -m 0755 ${WORKDIR}/bssrnet.service ${D}${sysconfdir}/systemd/system/bssrnet.service
}
