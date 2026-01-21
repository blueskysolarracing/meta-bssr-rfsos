SUMMARY = "Install the network configurations"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/conf:"

# No external sources — just using files shipped with the recipe
SRC_URI = "file://wpa_supplicant.conf \
           file://hostapd.conf"

do_install() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
    install -m 0644 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}/hostapd.conf
}
