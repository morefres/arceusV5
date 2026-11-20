.class public Lbj/e;
.super Lbj/a;
.source "SourceFile"


# instance fields
.field public final a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

.field public b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/roblox/client/provider/ShellConfigurationContentProvider;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lbj/a;-><init>()V

    iput-object p1, p0, Lbj/e;->a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    iput-object p2, p0, Lbj/e;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 2

    iget-object p1, p0, Lbj/e;->a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {p1}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lfh/c;

    move-result-object p1

    invoke-virtual {p1}, Lfh/c;->e()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lbj/e;->a:Lcom/roblox/client/provider/ShellConfigurationContentProvider;

    invoke-virtual {v0}, Lcom/roblox/client/provider/ShellConfigurationContentProvider;->d()Lfh/c;

    move-result-object v0

    invoke-virtual {v0}, Lfh/c;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lbj/e$a;

    invoke-direct {v1, p0, p1, v0}, Lbj/e$a;-><init>(Lbj/e;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public b(Lbj/i$a;)Lfh/a;
    .locals 1

    sget-object v0, Lbj/i$a;->a:Lbj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lfh/a;->h:Lfh/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
