SUMMARY = "Install some custom revolution helpers"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/scripts:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://revolution.sh \
           file://revolution-update.sh \
           file://revolution-install.sh"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${WORKDIR}/revolution.sh ${D}${bindir}/revolution
        install -m 0755 ${WORKDIR}/revolution-update.sh ${D}${bindir}/revolution-update
        install -m 0755 ${WORKDIR}/revolution-install.sh ${D}${bindir}/revolution-install 
}
