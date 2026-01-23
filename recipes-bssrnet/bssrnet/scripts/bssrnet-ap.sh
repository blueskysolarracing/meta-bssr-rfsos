#!/bin/sh

# -- START ACCESS POINT --
rfkill unblock all
systemctl restart hostapd
