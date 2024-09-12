DESCRIPTION = "dashboard"
LICENSE = "CLOSED"

QT_BASE = " \
qtbase \
"

QT_PKGS = " \
    qtdeclarative \
    qtserialbus \
    qtquickcontrols \
    qtquickcontrols2 \
    qtx11extras \
    qtvirtualkeyboard \
    qtwebengine \
    cinematicexperience \
    liberation-fonts \
    alsa-plugins \
"

DEPENDS = " \
${QT_BASE} \
${QT_PKGS} \
"

RDEPENDS:${PN} = " \
${QT_BASE} \
${QT_PKGS} \
"

SRC_URI = "git://github.com/AhmedAdelWafdy7/Coffee-Dashboard.git;protocol=https;branch=main"

SRCREV = "5a4ae72ad8a5369990799337e7db4f9a5d12f8c6"

S = "${WORKDIR}/git"

inherit qmake5

FILES_${PN} += "/usr/bin/coffeeplace"