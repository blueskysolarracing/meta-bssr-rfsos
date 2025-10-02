FILESEXTRAPATHS:prepend := "${THISDIR}/linux-toradex:"

CUSTOM_DEVICETREE = "bssr-devicetree.dts"

SRC_URI:append = " file://${CUSTOM_DEVICETREE} file://spidev.cfg"

do_configure:append() {
	# For arm32 bit devices
	# cp ${WORKDIR}/${CUSTOM_DEVICETREE} ${S}/arch/arm/boot/dts
	# For arm64 bit freescale/NXP devices
	cp ${WORKDIR}/${CUSTOM_DEVICETREE} ${S}/arch/arm64/boot/dts/freescale
}
