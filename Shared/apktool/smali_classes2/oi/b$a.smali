.class public Loi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Loi/b;


# direct methods
.method public constructor <init>(Loi/b;)V
    .locals 0

    iput-object p1, p0, Loi/b$a;->a:Loi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Loi/c;
    .locals 1

    new-instance v0, Loi/d;

    invoke-direct {v0, p1}, Loi/d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
