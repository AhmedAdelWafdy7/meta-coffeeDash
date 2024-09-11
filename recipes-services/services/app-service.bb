LICENSE = "CLOSED"

inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = " \
coffeeplace.service \
"

SRC_URI += " \
file://coffeeplace.service \
file://coffeeplace-service.sh \
"

RDEPENDS:${PN} = " \
bash \
"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/coffeeplace.service ${D}/${systemd_unitdir}/system 

  install -d ${D}${bindir}
  install -m 0755 ${WORKDIR}/coffeeplace-service.sh ${D}${bindir}
}
