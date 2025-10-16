#!/bin/sh

echo "(1/4) Installing Revolution"
revolution-update

echo "(2/4) Creating revolution-cfg"

rm -r /usr/share/revolution-cfg || true
mkdir /usr/share/revolution-cfg
cd /usr/share/revolution-cfg

touch revolution.conf
echo "AUTOSTART=0" > revolution.conf

echo "(3/4) Creating venv"
python3 -m venv venv
# echo "SKIPPING VENV"

echo "(4/4) Installing python packages"
source venv/bin/activate
pip3 install -r /usr/share/revolution/requirements.txt

echo "Done!"

cd ~
