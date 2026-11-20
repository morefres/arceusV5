.class public final synthetic Lgv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgv/e;


# direct methods
.method public synthetic constructor <init>(Lgv/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgv/b;->a:Lgv/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lgv/b;->a:Lgv/e;

    invoke-virtual {v0}, Lgv/e;->q()V

    return-void
.end method
