#!/bin/sh

# -- CONNECT TO WiFi --
# Start up WPA Supplicant
wpa_supplicant -B -i mlan0 -c /etc/wpa_supplicant.conf
# Obtain an IP by enabling DHCP
udhcpc -i mlan0 -v
