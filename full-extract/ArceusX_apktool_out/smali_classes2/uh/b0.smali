.class public final synthetic Luh/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Luh/j0;


# direct methods
.method public synthetic constructor <init>(Luh/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/b0;->a:Luh/j0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Luh/b0;->a:Luh/j0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Luh/j0;->b(Luh/j0;Ljava/lang/String;)V

    return-void
.end method
