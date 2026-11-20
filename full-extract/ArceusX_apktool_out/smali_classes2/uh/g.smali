.class public final synthetic Luh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Luh/i;


# direct methods
.method public synthetic constructor <init>(Luh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/g;->a:Luh/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Luh/g;->a:Luh/i;

    invoke-static {v0}, Luh/i;->a(Luh/i;)V

    return-void
.end method
