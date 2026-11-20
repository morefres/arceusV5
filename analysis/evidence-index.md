# Evidence index

This index ties the statements in [`REPORT.md`](REPORT.md) to files in the repository and commands that reproduce the measurements.

| Claim | Evidence | Reproduction |
| --- | --- | --- |
| The uploaded build is labeled `Roblox.-.Arceus.X.v5.1.6.6.apk` | [`full-extract/ArceusX_apktool_out/apktool.yml`](../full-extract/ArceusX_apktool_out/apktool.yml) | `grep '^apkFileName:' full-extract/ArceusX_apktool_out/apktool.yml` |
| Apktool metadata version is `2.9.3` | [`full-extract/ArceusX_apktool_out/apktool.yml`](../full-extract/ArceusX_apktool_out/apktool.yml) | `grep '^version:' full-extract/ArceusX_apktool_out/apktool.yml` |
| The package is `com.roblox.client` | [`full-extract/ArceusX_apktool_out/AndroidManifest.xml`](../full-extract/ArceusX_apktool_out/AndroidManifest.xml) | `grep -o 'package="[^"]*"' full-extract/ArceusX_apktool_out/AndroidManifest.xml` |
| The complete extraction has 45,827 files | [`full-extract/`](../full-extract/) | `find full-extract -type f | wc -l` |
| Apktool output has 29,548 files | [`full-extract/ArceusX_apktool_out/`](../full-extract/ArceusX_apktool_out/) | `find full-extract/ArceusX_apktool_out -type f | wc -l` |
| JADX output has 16,279 files | [`full-extract/ArceusX_jadx_out/`](../full-extract/ArceusX_jadx_out/) | `find full-extract/ArceusX_jadx_out -type f | wc -l` |
| There are 13,661 Java files | [`full-extract/ArceusX_jadx_out/sources/`](../full-extract/ArceusX_jadx_out/sources/) | `find full-extract/ArceusX_jadx_out/sources -type f -name '*.java' | wc -l` |
| There are 27,173 smali files | [`full-extract/ArceusX_apktool_out/`](../full-extract/ArceusX_apktool_out/) | `find full-extract/ArceusX_apktool_out -type f -name '*.smali' | wc -l` |
| The archive hash is `26b678...e3213` | [`V5/upload-sha256.txt`](../V5/upload-sha256.txt) | `sha256sum arceusV5.zip.rar` |
| Both extracted `libroblox.so` copies are the same object | The two paths under `full-extract/*/lib/arm64-v8a/libroblox.so` | `sha256sum full-extract/ArceusX_apktool_out/lib/arm64-v8a/libroblox.so full-extract/ArceusX_jadx_out/resources/lib/arm64-v8a/libroblox.so` |
| Oversized native files use Git LFS | [`.gitattributes`](../.gitattributes) and `git lfs ls-files` | `git lfs ls-files` |

The archive itself was integrity-tested with `unrar t` before the full extraction was committed. The archive is not duplicated in the repository; `V5/upload-sha256.txt` records its hash for provenance.
