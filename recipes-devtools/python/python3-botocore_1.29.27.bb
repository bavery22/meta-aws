# -*- mode: Conf; -*-
SUMMARY = "The low-level, core functionality of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "git://github.com/boto/botocore.git;protocol=https;branch=master"
SRCREV = "596c183f9b6e4584b303e4c933bca93c324bdb52"
S = "${WORKDIR}/git"

inherit setuptools3
PIP_INSTALL_PACKAGE = "botocore"

RDEPENDS:${PN} += "python3-jmespath python3-dateutil python3-logging"
