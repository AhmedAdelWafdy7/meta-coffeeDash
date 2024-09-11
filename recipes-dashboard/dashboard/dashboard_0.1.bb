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

SRCREV = "69dc2adca7ed7e5a003f1b62fa0cda896ee37537"

S = "${WORKDIR}/git"

inherit qmake5

FILES_${PN} += "/usr/bin/coffeeplace"