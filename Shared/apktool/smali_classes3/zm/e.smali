.class public final synthetic Lzm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/f$b;


# instance fields
.field public final synthetic a:Lzm/f;


# direct methods
.method public synthetic constructor <init>(Lzm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzm/e;->a:Lzm/f;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lzm/e;->a:Lzm/f;

    invoke-static {v0}, Lzm/f;->a(Lzm/f;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
