# Enable iptc support for Wi-Fi Access Point NAT/masquerading
# Required for IPMasquerade feature in systemd-networkd
# See: https://developer.toradex.com/linux-bsp/application-development/networking-connectivity/how-to-setup-wi-fi-access-point-mode-linux/

PACKAGECONFIG:append = " iptc"
