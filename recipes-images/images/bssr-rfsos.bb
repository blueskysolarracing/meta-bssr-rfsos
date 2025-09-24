require recipes-images/images/tdx-reference-minimal-image.bb

SUMMARY = "BSSR-RFSOS"
DESCRIPTION = "Layer on toradex-reference-minimal that adds BSSR utils"
LICENSE = "MIT"


PN = "bssr-rfsos"
export IMAGE_BASENAME = "bssr-rfsos"

IMAGE_INSTALL:append = " git"
