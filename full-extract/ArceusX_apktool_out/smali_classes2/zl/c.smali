.class public final synthetic Lzl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lzl/m$a;


# direct methods
.method public synthetic constructor <init>(Lzl/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzl/c;->a:Lzl/m$a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lzl/c;->a:Lzl/m$a;

    invoke-static {v0, p1}, Lzl/m;->l(Lzl/m$a;Ljava/lang/Exception;)V

    return-void
.end method
