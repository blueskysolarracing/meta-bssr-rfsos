require recipes-images/images/tdx-reference-minimal-image.bb

SUMMARY = "BSSR-RFSOS"
DESCRIPTION = "Layer on toradex-reference-minimal that adds BSSR utils"
LICENSE = "MIT"


PN = "bssr-rfsos"
export IMAGE_BASENAME = "bssr-rfsos"

IMAGE_INSTALL:append = "\
        python3 \
        python3-pip \
        python3-wheel \
        python3-dev \
        git \
        i2c-tools \
        revolution \
        revolution-utils \
        revolution-service \
        bssrnet-utils \
        bssrnet-config \
        bssrnet-service \
        hostapd-example \
        iptables \
        "
IMAGE_INSTALL:remove = "\
        connman \
        connman-client \
        connman-conf-dbg \
        connman-conf-dev \
        connman-dbg \
        connman-dev \
        connman-doc \
        connman-src \
        connman-tests \
        connman-tools \
        connman-wait-online \
        "
