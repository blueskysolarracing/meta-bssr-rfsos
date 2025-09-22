do_configure:append() {
    # Remove exisiting fdtfile, if there is one
    sed -i '/"fdtfile=.*\\0" \\/d' ${S}/include/configs/apalis-imx8.h
    # Add new fdtfile, "my-custom-devicetree.dtb" should be replaced with your device tree binary file
    sed -i 's/\("fdt_board=.*\\0" \\\)/\0\n      "fdtfile=bssr-devicetree.dtb\\0" \\/' ${S}/include/configs/apalis-imx8.h
}
