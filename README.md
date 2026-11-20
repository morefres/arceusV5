# Arceus X V5 — recovered Android sources

Best-effort static recovery of the uploaded **Arceus X V5 1.6.6** Android build.
The repository follows the layout used by [Executors-Decompiled](https://github.com/Aditya-lua/Executors-Decompiled/tree/main/Mobile/Arceus-X):

- [`Shared/apktool/`](Shared/apktool/) — Android manifest, resources, assets, smali, and unknown files recovered with Apktool.
- [`Shared/jadx/sources/`](Shared/jadx/sources/) — Java sources recovered with JADX.
- [`V5/`](V5/) — build metadata and scope notes.

This is reconstructed/decompiler output, not the vendor's original source. Names,
types, control flow, comments, and build files may be incomplete or inaccurate.
Raw APKs and native libraries are intentionally omitted, including the 103 MB
`libroblox.so` that exceeds GitHub's normal per-file limit. JADX's duplicate
`resources/` tree is also omitted because the Apktool tree is the canonical
resource copy.
