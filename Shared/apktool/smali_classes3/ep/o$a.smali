.class public final Lep/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lep/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lep/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lep/o;

    invoke-direct {v0}, Lep/o;-><init>()V

    sput-object v0, Lep/o$a;->a:Lep/o;

    return-void
.end method
