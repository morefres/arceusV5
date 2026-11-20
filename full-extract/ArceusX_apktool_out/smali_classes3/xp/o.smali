.class public final synthetic Lxp/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxp/q;

.field public final synthetic b:Lyp/c;


# direct methods
.method public synthetic constructor <init>(Lxp/q;Lyp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/o;->a:Lxp/q;

    iput-object p2, p0, Lxp/o;->b:Lyp/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxp/o;->a:Lxp/q;

    iget-object v1, p0, Lxp/o;->b:Lyp/c;

    invoke-static {v0, v1}, Lxp/q;->r(Lxp/q;Lyp/c;)V

    return-void
.end method
