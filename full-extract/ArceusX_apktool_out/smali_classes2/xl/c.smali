.class public final synthetic Lxl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxl/e;


# direct methods
.method public synthetic constructor <init>(Lxl/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/c;->a:Lxl/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxl/c;->a:Lxl/e;

    invoke-static {v0}, Lxl/e;->d(Lxl/e;)V

    return-void
.end method
