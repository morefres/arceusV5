.class public Lyj/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/f$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyj/k0;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lyj/k0;


# direct methods
.method public constructor <init>(Lyj/k0;)V
    .locals 0

    iput-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    const-string v0, "load_setting_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {}, Lug/e;->h()Lug/e;

    move-result-object v0

    iget-object v1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {v1}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lug/e;->i(Landroid/content/Context;)V

    if-nez p1, :cond_7

    const-string p1, "InitHelper"

    const-string v0, "getAllAppSettings: ... Settings loaded."

    invoke-static {p1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    sget-object v0, Lyj/k0$g;->c:Lyj/k0$g;

    invoke-static {p1, v0}, Lyj/k0;->g(Lyj/k0;Lyj/k0$g;)V

    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lyj/k0;->w(Landroid/content/Context;)V

    invoke-static {}, Lpl/j;->j()Lpl/j;

    move-result-object p1

    invoke-virtual {p1}, Lpl/j;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lpl/j;->j()Lpl/j;

    move-result-object p1

    iget-object v0, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {v0}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lpl/j;->i(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object p1

    invoke-virtual {p1}, Lim/f;->v()V

    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-virtual {p1}, Lyj/k0;->y()V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->r2()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object p1

    const-string v1, "mounted"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->c0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lzj/d;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    :cond_2
    :goto_0
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->n4()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->c0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {v0}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lzj/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {v0}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetBaseDataDirectories(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->c0()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lek/z;->e(Landroid/content/Context;)Lek/z;

    move-result-object p1

    invoke-virtual {p1}, Lek/z;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzj/d;->e(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->d(Lyj/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lek/z;->e(Landroid/content/Context;)Lek/z;

    move-result-object p1

    invoke-virtual {p1}, Lek/z;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    :goto_3
    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->m(Lyj/k0;)V

    return-void

    :cond_7
    iget-object p1, p0, Lyj/k0$a;->a:Lyj/k0;

    invoke-static {p1}, Lyj/k0;->l(Lyj/k0;)V

    return-void
.end method
