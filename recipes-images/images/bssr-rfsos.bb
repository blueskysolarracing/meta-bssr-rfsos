SUMMARY = "bssr-rfsos build recipe"
DESCRIPTION = "Recipe to build the RFSOS version of the tdx min build"
LICENSE = "MIT"

require recipes-images/images/tdx-reference-minimal-image.bb

PN = "bssr-rfsos"
export IMAGE_BASENAME = "bssr-rfsos"

IMAGE_INSTALL:append = " git"
