#!/bin/bash 
mkdir execs
make -C /home/imad/dev/workspace/phd/CyprIoT/generator/../examples/evaluation/smartHomeNetwork/externals/../devices/myTS/posix
cp /home/imad/dev/workspace/phd/CyprIoT/generator/../examples/evaluation/smartHomeNetwork/externals/../devices/myTS/posix/myTS_Cfg execs
gnome-terminal -x ./execs/myTS_Cfg
make -C /home/imad/dev/workspace/phd/CyprIoT/generator/../examples/evaluation/smartHomeNetwork/externals/../devices/mySAC/posix
cp /home/imad/dev/workspace/phd/CyprIoT/generator/../examples/evaluation/smartHomeNetwork/externals/../devices/mySAC/posix/mySAC_Cfg execs
gnome-terminal -x ./execs/mySAC_Cfg
