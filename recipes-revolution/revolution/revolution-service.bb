SUMMARY = "Install the revolution systemd service"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/service:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://revolution.service"

do_install() {
        install -d ${D}${sysconfdir}/systemd/system
        install -m 0755 ${WORKDIR}/revolution.service ${D}${sysconfdir}/systemd/system/revolution.service
}
