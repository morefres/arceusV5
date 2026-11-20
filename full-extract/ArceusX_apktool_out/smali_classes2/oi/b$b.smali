.class public final Loi/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Loi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loi/b;

    invoke-direct {v0}, Loi/b;-><init>()V

    sput-object v0, Loi/b$b;->a:Loi/b;

    return-void
.end method

.method public static bridge synthetic a()Loi/b;
    .locals 1

    sget-object v0, Loi/b$b;->a:Loi/b;

    return-object v0
.end method
