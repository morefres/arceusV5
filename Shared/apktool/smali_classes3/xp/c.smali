.class public final synthetic Lxp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxp/q;


# direct methods
.method public synthetic constructor <init>(Lxp/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/c;->a:Lxp/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxp/c;->a:Lxp/q;

    invoke-static {v0}, Lxp/q;->D(Lxp/q;)V

    return-void
.end method
