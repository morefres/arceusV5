.class public final synthetic Luh/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Luh/j0;


# direct methods
.method public synthetic constructor <init>(Luh/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/e0;->a:Luh/j0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Luh/e0;->a:Luh/j0;

    invoke-static {v0}, Luh/j0;->e(Luh/j0;)V

    return-void
.end method
