.class public final synthetic Lio/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Llo/b;

.field public final synthetic b:Lio/m;


# direct methods
.method public synthetic constructor <init>(Llo/b;Lio/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/b;->a:Llo/b;

    iput-object p2, p0, Lio/b;->b:Lio/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/b;->a:Llo/b;

    iget-object v1, p0, Lio/b;->b:Lio/m;

    invoke-static {v0, v1}, Lio/m;->k(Llo/b;Lio/m;)V

    return-void
.end method
