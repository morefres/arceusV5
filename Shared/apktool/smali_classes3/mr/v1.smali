.class public final synthetic Lmr/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmr/a2;


# direct methods
.method public synthetic constructor <init>(Lmr/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr/v1;->a:Lmr/a2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmr/v1;->a:Lmr/a2;

    invoke-static {v0}, Lmr/a2;->d(Lmr/a2;)V

    return-void
.end method
