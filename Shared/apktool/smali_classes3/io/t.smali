.class public final synthetic Lio/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/u;


# direct methods
.method public synthetic constructor <init>(Lio/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/t;->a:Lio/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/t;->a:Lio/u;

    invoke-static {v0}, Lio/u$a;->a(Lio/u;)V

    return-void
.end method
