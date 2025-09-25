#!/bin/sh

source /usr/share/revolution-cfg/venv/bin/activate

cd /usr/share/revolution
REVOLUTION_CONFIGURATIONS_MODULE=configurations python3 -m revolution

cd ~
