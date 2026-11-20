.class public final synthetic Lro/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Llo/i;


# direct methods
.method public synthetic constructor <init>(Llo/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/a;->a:Llo/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lro/a;->a:Llo/i;

    invoke-static {v0}, Lro/j;->c(Llo/i;)V

    return-void
.end method
