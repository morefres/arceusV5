# Arceus X V5 1.6.6 — extraction report

## Scope

This report describes the contents of the user-supplied `arceusV5.zip.rar` archive and the complete extraction committed under [`../full-extract`](../full-extract/). The archive contains reconstructed Android output from Apktool and JADX; it does not contain the original APK as a separate file.

The extraction was performed without filtering, deduplicating, or renaming archive entries. The full archive structure is preserved under:

- `full-extract/ArceusX_apktool_out/`
- `full-extract/ArceusX_jadx_out/`

The repository also retains the curated, reference-compatible layout under [`../Shared`](../Shared/) and the build metadata under [`../V5`](../V5/).

## Build metadata

The Apktool metadata identifies the recovered build as follows:

- APK filename recorded in `apktool.yml`: `Roblox.-.Arceus.X.v5.1.6.6.apk`
- Package from `AndroidManifest.xml`: `com.roblox.client`
- Roblox version name: `2.746.1266`
- Roblox version code: `20836`
- Minimum SDK: `26`
- Target SDK: `35`
- Apktool metadata version: `2.9.3`

These values describe metadata reconstructed by the supplied output. They are not an independent verification of the original APK's provenance or signature.

## Inventory

| Area | Files | Approximate size |
| --- | ---: | ---: |
| `ArceusX_apktool_out` | 29,548 | 447 MiB |
| `ArceusX_jadx_out` | 16,279 | 345 MiB |
| **Complete extraction** | **45,827** | **792 MiB** |

The most substantial text/decompiler outputs are 27,173 smali files and 13,661 Java files. Other common file types include 2,270 XML files, 1,460 PNG files, 240 JSON files, and 16 native shared libraries.

The largest files are the two identical `libroblox.so` copies at 107,385,184 bytes each. The duplicate resource trees also contain repeated shader packs and Roblox model resources. They are retained in `full-extract` because this report covers the archive exactly; the curated `Shared` tree avoids those duplicate copies.

## Integrity

The SHA-256 of the uploaded archive is recorded in [`../V5/upload-sha256.txt`](../V5/upload-sha256.txt):

```text
26b678ea9605fa0d91e7e1038ebd8cba2f5c2ec1d831c686b375f2def52e3213
```

The RAR archive passed a full `unrar t` integrity test before the extracted tree was committed. The two copies of `libroblox.so` have SHA-256 `596c13859c762dbafa895d4089e7fe7e884b408debd2f2c89f9d85098190e522`; the two copies of `libzstd-jni-1.5.7-6.so` have SHA-256 `c9a716123208b0e16202cce703ceb5f785e649efcbdfcf550ba1a64ecb5dea57`.

## Interpretation and limitations

Decompiler output is not the vendor's original source. Names, types, comments, control flow, resource relationships, and build configuration may be incomplete or inaccurate. The archive does not provide the original APK bytes, signing material, a reproducible build system, or a record of the JADX command and version used to produce the Java output.

No files in this repository should be treated as proof that the recovered output can be rebuilt into an equivalent APK. The native libraries are preserved as extracted binaries for completeness, but no dynamic execution or behavioral claims are made by this inventory report.

## References

- [Reference repository layout](https://github.com/Aditya-lua/Executors-Decompiled/tree/main/Mobile/Arceus-X)
- [Full archive extraction](../full-extract/)
- [Curated shared output](../Shared/)
