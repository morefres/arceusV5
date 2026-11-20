# Tools and reproducibility notes

## Tools used for this repository update

- `unrar` 7.00 freeware — listed, extracted, and integrity-tested the RAR archive.
- `git` — recorded the extracted files and pushed the repository commits.
- `git-lfs` — stored the two 107,385,184-byte `libroblox.so` files because they exceed GitHub's normal Git file-size limit.
- `sha256sum` — calculated archive and native-library checksums.
- `find`, `du`, `stat`, `grep`, `sort`, and `awk` — generated the inventory figures in [`REPORT.md`](REPORT.md).

The archive's `apktool.yml` records Apktool metadata version `2.9.3`. The archive does not record the JADX version or the exact decompilation command, so those details are intentionally not inferred.

## Reproduce the extraction

The original archive is not committed as a second copy. To reproduce the full extraction from the uploaded archive:

```bash
mkdir -p full-extract
unrar x -o+ arceusV5.zip.rar full-extract/
```

The expected extracted roots are:

```text
full-extract/ArceusX_apktool_out/
full-extract/ArceusX_jadx_out/
```

To verify the archive before extraction:

```bash
unrar t arceusV5.zip.rar
```

To verify the archive hash against the repository record:

```bash
sha256sum arceusV5.zip.rar
cat V5/upload-sha256.txt
```

To inspect the recovered Java and smali output:

```bash
find full-extract/ArceusX_jadx_out/sources -type f -name '*.java' | wc -l
find full-extract/ArceusX_apktool_out -type f -name '*.smali' | wc -l
```

## GitHub storage note

The complete archive extraction is committed under `full-extract/`. The two oversized `libroblox.so` files are Git LFS objects, referenced by `.gitattributes`. A fresh clone that needs those binaries must have Git LFS installed and enabled before checkout.

The curated `Shared` tree is intentionally separate from `full-extract`: it follows the reference repository's organization and avoids duplicate JADX resources, raw libraries, and other extraction-only directories. It is not a replacement for the complete archive extraction.
