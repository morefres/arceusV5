.class public final synthetic Lro/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lro/j;


# direct methods
.method public synthetic constructor <init>(Lro/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/i;->a:Lro/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lro/i;->a:Lro/j;

    invoke-static {v0}, Lro/j;->f(Lro/j;)V

    return-void
.end method
