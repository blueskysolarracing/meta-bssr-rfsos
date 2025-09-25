#!/bin/sh

cd /usr/share
echo "Clearing old build"
rm -r revolution || true
echo "Cloning from source"
git clone https://github.com/blueskysolarracing/revolution.git

cd ~
